package utility;

import java.io.FileOutputStream;
import java.io.IOException;

public class BuiltinFunctionASMPrinter {
    String builtin_s_as_literal = """
    .text
    .file	"builtin.c"
    .globl	print                   # -- Begin function print
    .p2align	1
    .type	print,@function
print:                                  # @print
# %bb.0:
    tail	printf
.Lfunc_end0:
    .size	print, .Lfunc_end0-print
                                        # -- End function
    .globl	println                 # -- Begin function println
    .p2align	1
    .type	println,@function
println:                                # @println
# %bb.0:
    tail	puts
.Lfunc_end1:
    .size	println, .Lfunc_end1-println
                                        # -- End function
    .globl	printInt                # -- Begin function printInt
    .p2align	1
    .type	printInt,@function
printInt:                               # @printInt
# %bb.0:
    lui	a1, %hi(.L.str.1)
    addi	a1, a1, %lo(.L.str.1)
    mv	a2, a0
    mv	a0, a1
    mv	a1, a2
    tail	printf
.Lfunc_end2:
    .size	printInt, .Lfunc_end2-printInt
                                        # -- End function
    .globl	printlnInt              # -- Begin function printlnInt
    .p2align	1
    .type	printlnInt,@function
printlnInt:                             # @printlnInt
# %bb.0:
    lui	a1, %hi(.L.str.2)
    addi	a1, a1, %lo(.L.str.2)
    mv	a2, a0
    mv	a0, a1
    mv	a1, a2
    tail	printf
.Lfunc_end3:
    .size	printlnInt, .Lfunc_end3-printlnInt
                                        # -- End function
    .globl	getInt                  # -- Begin function getInt
    .p2align	1
    .type	getInt,@function
getInt:                                 # @getInt
# %bb.0:
    addi	sp, sp, -16
    sw	ra, 12(sp)
    lui	a0, %hi(.L.str.1)
    addi	a0, a0, %lo(.L.str.1)
    addi	a1, sp, 8
    call	__isoc99_scanf
    lw	a0, 8(sp)
    lw	ra, 12(sp)
    addi	sp, sp, 16
    ret
.Lfunc_end4:
    .size	getInt, .Lfunc_end4-getInt
                                        # -- End function
    .type	.L.str.1,@object        # @.str.1
    .section	.rodata.str1.1,"aMS",@progbits,1
.L.str.1:
    .asciz	"%d"
    .size	.L.str.1, 3

    .type	.L.str.2,@object        # @.str.2
.L.str.2:
    .asciz	"%d\\n"
    .size	.L.str.2, 4

    .ident	"clang version 10.0.0-4ubuntu1 "
    .section	".note.GNU-stack","",@progbits
""";
    public BuiltinFunctionASMPrinter(String dst) throws IOException {
        FileOutputStream out = new FileOutputStream(dst);
        out.write(builtin_s_as_literal.getBytes());
    }
}
