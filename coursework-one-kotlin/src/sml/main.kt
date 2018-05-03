package sml

//import sml.Machine
import sml.instructions.AddInstruction
import java.io.File
import java.io.InputStream
import java.util.*
import kotlin.reflect.full.*

fun main(args: Array<String>) {
    val ham = Instruction::class



    if (args.size != 1) {
        println("Incorrect number of arguments - sml.Machine <file> - required")
        System.exit(-1)
    }

    val m = Machine(0, 32) // initialise to first instruction

    if (!m.readAndTranslate(args[0])) { // convert and add to machine
        println("Translation phase failed!!")
    } else {
        println("Here is the program; it has " + m.prog.size + " instructions.")
        println(m)

        print("Beginning program execution...")
        m.execute()
        println("Ending program execution.")

        println("Values of registers at program termination: " + m.registers + ".")
    }
}