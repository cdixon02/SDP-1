package sml.instructions

import sml.Instruction
import sml.Machine
import sml.Registers

/**
 * Describes the SML ADD instruction
 *
 */
class OutInstruction(label: String, val op1: Int) : Instruction(label, "out") {

    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        println("\nValue for the calcuation is: ${value1}")



    }

    override fun toString(): String {
        return super.toString() + " Printing value in r" + op1
    }
}
