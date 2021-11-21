function validarForma(forma){
    let user = forma.user;
    if(user.value == "" || user.value == "Escribe tu nombre"){
        user.focus();
        user.select();
        return false;
    }  

    let password = forma.password;
    if(password.value == "" || password.value.length < 3){
        alert("El password minimo debe tener 3 caracteres");
        password.focus();
        password.select();
        return false;
    }

    let tecnolgia = forma.tecnologias;
    let checkSeleccionado = false;
    for(var i = 0; i < tecnolgia.length; i++){
        if(tecnolgia[i].checked){
            checkSeleccionado = true;
        }
    }

    if(!checkSeleccionado){
        alert("Debe seleccionar una tecnologia");
        return false;
    }
    let generos = forma.genero;
    let radioSeleccionado = false;
    for(var i = 0; i < generos.length; i++){
        if(generos[i].checked){
            radioSeleccionado = true;
        }
    }
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }

    let ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe seleccionar una ocupacion");
        return false;
    }
    //Formulario es valido
    alert("Formulario valido se envian datos al servidor");
    return true;
}