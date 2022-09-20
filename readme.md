# Compiler ACMOJ Sample

This is a sample repo for Mx Compiler ACMOJ testing in Java.

1. 关于文件：将所有代码放在 repo 的 ``src`` 文件夹下。``src`` 文件夹内的文件怎么放不受限制，你可以自行设计包结构；但 **入口类的类名必须为 ``Compiler``**，因此，显然 ``src`` 文件夹内会存在一个 ``Compiler.java``。
2. 关于 ``classpath`` 链接：请在 repo 最外层目录附上 你需要链接的 ``jar`` 文件，比如 ``antlr-runtime-4.8.jar``，名称不限，只要以 ``jar`` 结尾即可。相较于 ``complete`` 包，``runtime`` 包体积更小，更不容易出现拉取失败的情况，推荐使用。
2. 关于输入输出：与 ``Git (C++)`` 评测方式一致，从 ``stdin`` 读取输入。``Semantic`` 阶段暂时没有需要输出的东西，所以你往 ``stdout`` 输出的东西将被忽略；如果你试图创建文件，很有可能你会喜提 ``DLE (Disk Limit Exceeded)`` 报错。
3. 关于编译指令：``build.bash`` 等 在 ACMOJ 上不再生效。
3. 关于提交：我们正在持续改进 OJ 的自动语言识别，以免把 ``git java`` 类评测识别成 ``git C++``。目前你可能需要手动选择提交语言。

