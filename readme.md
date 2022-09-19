# Compiler ACMOJ Sample

This is a sample repo for Mx Compiler ACMOJ testing in Java.

1. 关于文件：将所有代码放在 repo 的 ``src`` 文件夹下。``src`` 文件夹内的文件怎么放不受限制，你可以自行设计包结构；但 **入口类的类名必须为 ``Compiler``**，因此，显然 ``src`` 文件夹内会存在一个 ``Compiler.java``。
2. 关于 ``classpath`` 链接：请在 repo 最外层目录附上 你需要链接的 ``jar`` 文件，比如 ``antlr-4.8-complete.jar``，名称不限，只要以 ``jar`` 结尾即可。
2. 关于输入输出：与 ``Git (C++)`` 评测方式一致，从 stdin 读取输入。
3. ``build.bash`` 等 在 ACMOJ 上不再生效。