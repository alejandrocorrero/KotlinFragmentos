package com.alejandrocorrero.kotlinfragmentos.utils

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction


fun FragmentManager.executeTransaction(operations: FragmentTransaction.()->Unit){
    val transaction=beginTransaction()
    transaction.operations()
    transaction.commit()
}