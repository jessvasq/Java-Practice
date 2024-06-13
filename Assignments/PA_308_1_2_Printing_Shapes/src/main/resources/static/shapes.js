function createBox(){
    let boxWidth = parseInt(document.getElementById('width').value);
    let boxHeight = parseInt(document.getElementById('height').value);

    let box = '';
    for (let i=0; i<boxHeight; i++) {
        let row = '';
        for (let j = 0; j < boxWidth; j++) {
            row += '*';
        }
        box += row + '\n';
    }
    document.getElementById("box").innerHTML = box;
}


function createCheckBoard(){
    let boardWidth = parseInt(document.getElementById('width').value);
    let boardHeight = parseInt(document.getElementById('height').value);

    let board = '';

    for (let row=0; row<boardHeight; row++){
        let rows= '';
        for (let col=0; col<boardWidth; col++){
            if ((row+col) % 2 === 0){
                rows += '*';
            } else {
                rows += ' ';
            }
        }

        board += rows + '\n';
    }
    document.getElementById("board").innerHTML = board;
}


function createCross(){
    let crossSize = parseInt(document.getElementById('size').value);

    let cross = '';
    for (let row=0; row < crossSize; row++){
        let rows = '';
        for (let col=0; col<crossSize; col++){
            if (row === col || col === crossSize-row-1){
                rows += '*';
            } else {
                rows += ' ';
            }
        }
        cross += rows += '\n';
    }
    document.getElementById("cross").innerHTML = cross;
}


function createLowerTriangle(){
    let triangleLength = parseInt(document.getElementById("size").value);

    let triangle = '';

    for (let row=0; row < triangleLength; row++){
        let rows = '';
        for (let col=0; col<triangleLength; col++){
            if (col <= row){
                rows += '*';
            } else {
                rows += ' ';
            }
        }
        triangle += rows += '\n';
    }
    document.getElementById("triangle").innerHTML = triangle;
}


function createUpperTriangle(){
    let triangleSize = parseInt(document.getElementById("size").value);

    let triangle = '';

    for (let row=0; row < triangleSize; row++){
        let rows = '';
        for (let col=0; col<triangleSize; col++){
            if (col >= row)  {
                rows += '*';
            } else {
                rows += ' ';
            }
        }
        triangle += rows += '\n';
    }
    document.getElementById("triangle").innerHTML = triangle;

}

function upsideDownTrapezoid(){
    let trapezoidHeight = parseInt(document.getElementById("height").value);
    let trapezoidWidth = parseInt(document.getElementById("width").value);

    if ( trapezoidHeight > ((trapezoidWidth + 1) / 2)){
        alert("Impossible Shape")
    } else {
        let trapezoid = '';

        for (let row = 0; row < trapezoidHeight; row++) {
            let rows = '';
            for (let col = 0; col < row; col++) {
                rows += ' ';
            }
            for (let col = 0; col < trapezoidWidth - 2 * row; col++) {
                rows += '*';
            }
            trapezoid += rows += '\n';
        }
        document.getElementById("trapezoid").innerHTML = trapezoid;
    }
}