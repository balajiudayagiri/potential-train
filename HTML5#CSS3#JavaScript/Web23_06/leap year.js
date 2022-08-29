var year = prompt(" your choice of year ");
function isleap(year){
    if (year % 4 === 0){
    if (year % 100 === 0){
        if (year % 400 === 0){
            alert("year " + year + " is not a leap year");  
       
         }else{
        alert("year " + year + " is a leap year");
             }

    }else{
    alert("year " + year + " is a not leap year");
} 
}
}