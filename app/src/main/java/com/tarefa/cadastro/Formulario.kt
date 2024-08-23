package com.tarefa.cadastro

class Formulario {
    private var fullName: String = ""
    private var phone: String = ""
    private var email: String = ""
    private var receiveEmails: Boolean = false
    private var sex: String = ""
    private var city: String = ""
    private var state: States = States.ACRE

    constructor(
        fullName: String,
        phone: String,
        email: String,
        receiveEmails: Boolean,
        sex: String,
        city: String,
        state: States
    ) {
        this.fullName = fullName
        this.phone = phone
        this.email = email
        this.receiveEmails = receiveEmails
        this.sex = sex
        this.city = city
        this.state = state
    }

    var FullName: String = fullName
        private set

    var Phone: String = phone
        private set

    var Email: String = email
        private set

    var ReceiveEmails: Boolean = receiveEmails
        private set

    var Sex: String = sex
        private set

    var City: String = city
        private set

    var State: States = state
        private set

}