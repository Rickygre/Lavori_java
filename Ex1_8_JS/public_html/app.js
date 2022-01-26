



let inputElement = document.querySelector("#textnumero");

let btnElement = document.querySelector("#btnanalizza");

let spanElement = document.querySelector("#jLabel3");

btnElement.onclick = onAnalizzaClick;

function onAnalizzaClick(e) {
    let ris = analizza(inputElement.value);
    console.log("risultato", ris);
}

function analizza(input) {

    let ris;
    let x = parseInt(input);
    let n = 1;
    let sommaDivisori = 0;
    while (n < x) {
        if (x % n === 0) {
            sommaDivisori += n;
        }
        n++;
    }
    console.log("somma divisori", sommaDivisori, "x", x);
    if (sommaDivisori === x) {
        ris = "perfetto";
    } else if (sommaDivisori > x) {
        ris = "abbondante";
    } else {
        ris = "difettivo";
    }
    return ris;

}