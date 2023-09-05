const imgs = document.getElementById("img");
const img = document.querySelectorAll("#img img");

let idx = 0;

function carousel(){
    idx++;

    if(idx > img.length - 5){
        idx = 0;
    }

    imgs.style.transform = `translateX(${-idx * 100}px)`;
}

setInterval(carousel, 1200);