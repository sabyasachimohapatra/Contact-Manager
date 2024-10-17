document.querySelector("#theme_change_button").addEventListener("click",()=>{
    let currTheme="light";

    if(localStorage.getItem("theme")){
        currTheme=localStorage.getItem("theme");
    }
    if(currTheme=="light"){
       
        document.querySelector("html").classList.remove("light");
        document.querySelector("html").classList.add("dark");
        currTheme="dark";
    }
    else{
       
        document.querySelector("html").classList.remove("dark");
        document.querySelector("html").classList.add("light");
        currTheme="light";
    }

    localStorage.setItem("theme",currTheme);

    // change the text of button
   
    document
      .querySelector("#theme_change_button")
      .querySelector("span").textContent = currTheme == "light" ? "Dark" : "Light";
})