#/bin/bash
java --enable-preview --add-modules jdk.incubator.vector -classpath app/build/libs/app.jar com.compinion.llama3.App --model Meta-Llama-3.1-8B-Instruct-Q4_0.gguf --system-prompt "Du bist Adam Bien." --chat

