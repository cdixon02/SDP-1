package sml.instructions

import sml.Instruction
import sml.Machine

/**
 * Describes the SML ADD instruction
 *
 */
class BnzInstruction(label: String,  val op1: Int, val l2: String ) : Instruction(label, "bnz") {

    override fun execute(m: Machine) {
        val value1 = m.registers.getRegister(op1)
        val labelString = l2[1].toString()
        val labelInt = labelString.toInt()
        if(value1 != 0){
            m.pc = labelInt -1
        }

    }

    override fun toString(): String {
        return super.toString() + " If r" + op1 + " is 0 then: PC = " + l2
    }
}
