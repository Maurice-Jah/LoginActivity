package com.example.fun_fact

object DummyData {
    val funFacts = listOf<FactModel>(
     FactModel(
          "Kotlin",
         R.drawable.kotlin_logo,
          "The name comes from Kotlin Island, near St. Petersburg. Andrey Breslav mentioned that the team decided to name it after an island"
     ),
        FactModel(
            "Java",
            R.drawable.java_logo,
            "The language was initially called Oak tree that stood outside Gosling's office."
        ),
        FactModel(
            "Python",
            R.drawable.python_logo,
            "Why is it called Python? ...When he began implementing Python, Guido Van Rossum was reading the published scripts from 'Monty Python's Flying Circus',a BBC comedy series from the 1970s. Van Rossum thought he needed a name that was short, unique, and slightly mysterious, so he decided to call the language Python"
        ),
        FactModel(
            "Javascript",
            R.drawable.js_logo,
            "The name Javascript came from Netscape's support of Java applets with its browser"
        ),
        FactModel(
            "PHP",
            R.drawable.ic_php_logo,
            "PHP originally stood for Personal Home Page,but it now stands for the recursive initialism PHP: Hypertext Preprocessor"
        )
    )
}