function Kjopbilett() {
    const fornavn = $("#fornavn").val();
    const etternavn = $("#etternavn").val();
    const telefonnr = $("#tlf").val();
    const epost = $("#epost").val();
    const film = $("#film").val();
    const antall = $("#antall").val();
    let feil = false;

    // Regular expressions for phone number and email validation
    const telefonPattern = /^\d{8,12}$/;
    const epostPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    // Validate phone number
    if (!telefonPattern.test(telefonnr)) {
        alert("Feil telefonnummer, prøv igjen");
        feil = true;
    }

    // Validate email
    if (!epostPattern.test(epost)) {
        alert("Feil epost, prøv igjen");
        feil = true;
    }

    // Create customer object
    let bruker = {
        fornavn: fornavn,
        etternavn: etternavn,
        epost: epost,
        telefonnr: telefonnr,
        antall: antall,
        film: film

    }

    if(!feil){
        // Clear form fields
        $("#fornavn").val("");
        $("#etternavn").val("");
        $("#tlf").val("");
        $("#epost").val("");
        $("#film").val("");
        $("#antall").val("");

        // Call function to retrieve all tickets
        $.get("/lagrekunder", bruker, function () {
            hentAlle();
        });
    }
}

function hentAlle() {
    $.get("/hent", function (data) {
        visKjop(data);
        console.log(data)
    });
}
function visKjop(data) {
    console.log("viskjop() blir kalt")
    let ut = "<table>" ;
    ut +=  "<tr>" + "<th>Film</th><th>Antall</th><th>Navn</th><th>Etternavn</th><th>Telefonnr</th><th>Epost</th>" + "</tr>";
    for (let i of data) {
        ut += "<tr>"
            + "<td>" + i.film + "</td><td>" + i.antall + "</td><td>"
            + i.fornavn + "</td><td>" + i.etternavn + "</td><td>"
            + i.telefonnr + "</td><td>" + i.epost + "</td>"+"</tr>";
        ut += "</table>";
    }

    document.getElementById("liste").innerHTML = ut;

}
function Slett(){
    $.get("/Slett", function(){
        hentAlle()
    });
}


