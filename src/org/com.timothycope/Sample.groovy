package com.timothycope

class Sample {
    /**
    * Echoes 'Hello, World!'
    * @param context - The `config[:]` passed in as `this` from the calling method.
    */
    static def Foo(context, text) {
        context.sh "echo ${text}"
    }
}