# Compiler ACMOJ Sample

This is a sample repo for Mx Compiler ACMOJ testing in Java.

1. 关于文件：将所有代码放在 repo 的 ``src`` 文件夹下。``src`` 文件夹内的文件怎么放不受限制，你可以自行设计包结构。
2. 关于 ``classpath`` 链接：请在 repo 最外层目录附上 你需要链接的 ``jar`` 文件，比如 ``antlr-runtime-4.8.jar``，名称不限，只要以 ``jar`` 结尾即可。相较于 ``complete`` 包，``runtime`` 包体积更小，更不容易出现拉取失败的情况，推荐使用。
3. 关于输入：与 ``Git (C++)`` 评测方式一致，从 ``stdin`` 读取输入。
4. ``Semantic`` 阶段的输出（对应题号 20000）：``Semantic`` 阶段没有需要输出的东西，所以你往 ``stdout`` 输出的东西将被忽略；如果你试图创建文件，你会喜提 ``DLE (Disk Limit Exceeded)`` 报错。
5. ``Codegen`` 阶段的输出（对应题号 19999）：在 ``Codegen`` 阶段，你的编译器往 ``stdout`` 输出的东西依然将被忽略。文件读写方面，编译后的 Mx 程序应当输出到 repo 根目录下的 `output.s` 文件，同时将需要链接的 `builtin.s` 文件也**输出**到 repo 根目录下。文件数量限制为 5 个，总空间限制为 64 MiB。考虑到理论上 ``ravel`` 只需要上述两个汇编就能工作，我确信这个限制是够用的。**特别提醒：由于 ACMOJ 沙箱限制，你的 Mx 编译器的源代码所处的文件夹 和 输出 ``output.s`` 的工作文件夹是不同的文件夹，因此不管你将编译好的``builtin.s`` 放在 repo 的哪个角落 ``ravel`` 都看不到；因此需要麻烦大家把``builtin.s`` 嵌在编译器里和 ``output.s``一起输出。参考样例代码的 ``utility.BuiltinFuntionASMPrinter`` 。**
6. 关于编译指令：``build.bash``，``semantic.bash``，``codegen.bash`` 等 在 ACMOJ 上不再生效。
7. 关于语言：目前 OJ 已经支持的语言：Git Java，Git Python，Git C++。
   - Git Java 程序入口为 ``src/Compiler.java (public class Compiler)``。
   - Git Python 程序入口为 ``src/Compiler.py (__main__)``。
   - Git C++ 程序入口为 ``code`` 这个二进制文件。
   - Kotlin 在打包成 jar 文件以后与 Git Java 兼容，当然用 Java 的同学怕出锅打包成 jar 也不是不行。
   - OJ 的自动语言检测弃疗了。目前你可能需要手动选择提交语言。如果你有什么好的自动检测语言想法，欢迎告诉我。

