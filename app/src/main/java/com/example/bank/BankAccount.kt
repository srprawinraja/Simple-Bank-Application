package com.example.bank

fun main(){
    var xyzBankAccount=BankMain("xyz",0.0)
    var zyxBankAccount=BankMain("zyx",0.0)

    xyzBankAccount.deposit(100.0)
    zyxBankAccount.deposit(200.0)

    xyzBankAccount.withdraw(10.0)
    zyxBankAccount.withdraw(50.0)

    xyzBankAccount.displayTransactionHistory()
    zyxBankAccount.displayTransactionHistory()

    xyzBankAccount.availableBalance()
    zyxBankAccount.availableBalance()

}
