# throwableLibrary

INTEGRATION GUIDE
1. clone for repository: https://github.com/RomanFedkiv/throwableLibrary.git
2. for use library, add to your project this line: 
    implementation 'com.github.RomanFedkiv:throwableLibrary:1.2'
3. you can use two methods: 
   *ThrowableCheck.writeToLog(throwable);
   *ThrowableCheck.writeFileOnInternalStorage(context,throwable);
4. when you invoke any type of Throwable, you can see in LogCat your problem with TAG='com.example.throw.lib'
   
PROBLEMS
1. When you write library on Kotlin, Android Studio in project doesn`t see any class/method of library, i don`t find a decision
2. Hard for testing, because you need a push new version of library to github and create a new release of this library
