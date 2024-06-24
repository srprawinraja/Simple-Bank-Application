package com.example.bank

class BankMain(var accountholder: String, var balance: Double) {
    private val transactionHistory= mutableListOf<String>()

    fun deposit(amount: Double) {
        balance+=amount
        transactionHistory.add("$accountholder deposited $amount")
    }

    fun withdraw(amount: Double) {
        if(amount<=balance){
            balance-=amount
            transactionHistory.add("$accountholder withdrawed $amount")
        }
        else print("Insufficient Balance")

    }

    fun availableBalance(){
        println("Available Balance on $accountholder account: $balance")
    }


    fun displayTransactionHistory() {
        for(transaction in transactionHistory){
            println(transaction)
        }
    }

}