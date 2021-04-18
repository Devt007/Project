<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
    <link rel=" stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
        integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>Star Rating</title>
   <style>



.btn{
    background-color: #f8d63c;
    margin-top: 15px;
    margin-right: 15px;
}

td>span>input {
    width: 60px;
}

.stars-outer {
    position: relative;
    display: inline-block;
}

.stars-inner {
    position: absolute;
    top: 0;
    left: 0;
    white-space: nowrap;
    overflow: hidden;
    width: 0;
}

.stars-outer::before {
    content: "\f005 \f005 \f005 \f005 \f005";
    font-family: 'Font Awesome 5 Free';
    font-weight: 900;
    color: #ccc;
}

.stars-inner::before {
    content: "\f005 \f005 \f005 \f005 \f005";
    font-family: 'Font Awesome 5 Free';
    font-weight: 900;
    color: #f8ce0b;
}




   </style>
</head>

<body>
    <div class="container">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Books</th>
                    <th>Rating value</th>
                    <th>Stars</th>
                </tr>
            </thead>
            <tbody>
                <tr class="book1">
                    <td>Book-1</td>
                    <td>Rating Value: <span><input id="i11" type="number" step="0.1"></span> out of <span><input id="i12" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book2">
                    <td>Book-2</td>
                    <td>Rating Value: <span><input id="i21" type="number" step="0.1"></span> out of <span><input id="i22" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book3">
                    <td>Book-3</td>
                    <td>Rating Value: <span><input id="i31" type="number" step="0.1"></span> out of <span><input id="i32" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book4">
                    <td>Book-4</td>
                    <td>Rating Value: <span><input id="i41" type="number" step="0.1"></span> out of <span><input id="i42" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book5">
                    <td>Book-5</td>
                    <td>Rating Value: <span><input id="i51" type="number" step="0.1"></span> out of <span><input id="i52" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book6">
                    <td>Book-6</td>
                    <td>Rating Value: <span><input id="i61" type="number" step="0.1"></span> out of <span><input id="i62" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
                <tr class="book7">
                    <td>Book-7</td>
                    <td>Rating Value: <span><input id="i71" type="number" step="0.1"></span> out of <span><input id="i72" type="number"
                                step="0.1"></span></td>
                    <td>
                        <div class="stars-outer">
                            <div class="stars-inner"></div>
                        </div>
                        <span class="number-rating"></span>
                    </td>
                </tr>
            </tbody>
        </table>
        <button id="btn" class="btn">Submit</button>
        <button id="clr" class="btn">Clear</button>
    </div>
    <script>

        document.getElementById("btn").addEventListener('click', getFinalRatingPercentage);

        function getFinalRatingPercentage() {
            console.log("ratings");
            const fields =  document.querySelectorAll('input');
            let count=0;
            let percentageValue = 0;
            for(let i=0; i<fields.length;){
                    console.log(fields[i+1].value);
                    if(fields[i+1].value == 10){
                        console.log("i'm in 10 block");
                        fields[i].value = (fields[i].value)/2;
                        fields[i+1].value = (fields[i+1].value)/2;
                        percentageValue = ((fields[i].value)/(fields[i+1].value))*100;
                        percentageValue = `${Math.trunc(percentageValue)}%`;
                        console.log(`i=${i} and i+1=${i+1} | out of 10: ${percentageValue}`);
                    }else if(fields[i+1].value == 100){
                        console.log("i'm in 100 block");
                        fields[i].value = (fields[i].value)/20;
                        fields[i+1].value = (fields[i+1].value)/20;
                        percentageValue = ((fields[i].value)/(fields[i+1].value))*100;
                        percentageValue = `${Math.trunc(percentageValue)}%`;
                        console.log(`i=${i} and i+1=${i+1} | out of 100: ${percentageValue}`);
                    }else{
                        percentageValue = ((fields[i].value)/(fields[i+1].value))*100;
                        percentageValue = `${Math.trunc(percentageValue)}%`;
                        console.log(`i=${i} and i+1=${i+1} | out of 5: ${percentageValue}`);
                    }
                count++;
                console.log("book"+count);
                document.querySelector(`.book${count} .stars-inner`).style.width = percentageValue;
                i+=2;
            }
        }

        document.getElementById("clr").addEventListener('click', clearAllFields);

        function clearAllFields(){
            const fields =  document.querySelectorAll('input');
            for(let i=0; i<fields.length; i++){
                fields[i].value = "";
            }
        }
    </script>
</body>

</html>
