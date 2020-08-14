package com.crisspian.kotlin_viernes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var a = 10
//        var b = 20
//
//        var texto = "Estos valores son $a y  $b "
//        var textosumado = "La suma de $a  y $b es igual a ${a + b}"
//
//        Log.d("DATO", texto)
//        Log.d("DATO", textosumado)
//
//


        val lista = listOf(1 to "z", 2 to "y", 7 to "x", 6 to "t", 5  to "m", 6 to "a")
        action_btn.setOnClickListener {
          lista.sortedBy { it.second }
            result_tv.text = lista.toString()
        }

//        val numbersInt = listOf(1, 2, 3)
//        val numbers = listOf("one", "two", "three","three")
//        var prueba1 = numbers.get(2)
//        var prueba = numbers[2]
//
//
//        val numbersMap = mapOf("key1" to null, "key2" to 2, "key3" to 3, "key1" to 1, "key1" to 12)
//        if (1 in numbersMap.values) println("The value 1 is in the map")
//        if (numbersMap.containsValue(1)) println("The value 1 is in the map")
//
//        if ("key1" in numbersMap)
//            Log.d("DATO1", "${numbersMap.size}" )

//        if (1 in numbersMap.values)
//            Log.d("DATO1", "el valor 1 esta en el mapa " )
//        else
//            Log.d("DATO1", "no esta ")
//        if (numbersMap.containsValue(1))
//            Log.d("DATO2", "el valor 1 esta en el mapa " )
//        else
//            Log.d("DATO2", "no esta el valor ")

//        val numbers = listOf("onessss", "two", "three", "four")
//        val greaterThan3 = numbers.filter { it.contains("o")  }
//
//
//        val numbers = listOf("one", "two", "three", "four")
//       // val mFilteredIdx = numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5) }.toString()
//        Log.d("TAG", numbers.filterIndexed { index, s -> (index != 0) && (s.length < 5) }.toString())
//

//        val numbers = listOf(null, 1, "two", 3.0, "four")
//        var result = ""
//        var result1 = numbers.filterIsInstance<String>();

//        val numbers = listOf("one", "two", "three", "four", "a", "werwerwer")
//        val (inRange, restOfElements) = numbers.partition { it.length > 3 }
//
//        Log.d("TAG", inRange.toString())
//        Log.d("TAG", restOfElements.toString())

//        val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 5, "key11" to 15)
//        val filteredMap = numbersMap.filter { (key, value) -> key.endsWith("1") && value > 10}
//        Log.d("TAG", filteredMap.toString())
    }
}