var ajaxRequest = new XMLHttpRequest();

ajaxRequest.onreadystatechange = function(){
    if(this.readyState == 4 && this.status ==200){
        var jsondata = JSON.parse(ajaxRequest.responseText);
        var info = jsondata.items;

        var parent = document.getElementById('parent');
        var cont = document.createElement("div");        
        parent.appendChild(cont);
       
        
        var card = document.createElement("div");
        cont.appendChild(card);
        cont.style="position: relative;padding-bottom:20px"

       for(i=0;i<info.length;i++){
        
        var text = document.createElement("div");
        cont.appendChild(text);
        text.innerHTML = info[i].list;
        text.style="padding-top:10px;padding-left:15px;font: Regular 12px/18px Roboto;letter-spacing: 0.78px;color: #747474;width:35%;float:left";


        var text = document.createElement("div");
        cont.appendChild(text);
        text.innerHTML = info[i].number;
        text.style="float:left;padding-left:10%;padding-top: 30px;text-align: center; font: Regular 12px/66px Roboto;letter-spacing: 0.6px;color: #707070;";

        var text = document.createElement("div");
        cont.appendChild(text);
        text.innerHTML = info[i].date;
        text.style="float:left;padding-left: 10%;padding-top: 30px;text-align: center;font: Regular 12px/66px Roboto;letter-spacing: 0.6px;color: #707070;";

        var text = document.createElement("div");
        cont.appendChild(text);
        text.innerHTML = info[i].price;
        text.style = "padding-left:10%;padding-top: 30px;text-align: center; font: Regular 12px/66px Roboto;letter-spacing: 0.6px;color: #707070;float:left";
        
        var image = document.createElement("img");
        cont.appendChild(image);
        image.src = info[i].image;
        image.style = "float:right;padding-right:20px; width:40px ;height:40px ;padding-top:30px";

        var text = document.createElement("div");
        cont.appendChild(text);
        text.style = "clear:both";

    }
}
};
ajaxRequest.open(
    "GET","Requisition12_data.json",true
);
ajaxRequest.send();
