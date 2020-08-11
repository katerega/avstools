/data/data/berserker.android.apps.sshdroid/home $ cat test.sh 
#!/bin/bash
#!/system/bin/sh
var=`ifconfig -a`;
echo $var;

/data/data/berserker.android.apps.sshdroid/home $ chmod +x test.sh 
/data/data/berserker.android.apps.sshdroid/home $ ./test.sh 
sh: ./test.sh: not found
/data/data/berserker.android.apps.sshdroid/home $ uname -a
Linux localhost 2.6.36.3-00004-g069b8b5 #1 SMP PREEMPT Wed May 11 22:14:22 CST 2011 armv7l GNU/Linux

/data/data/berserker.android.apps.sshdroid/home $ bash ./test.sh 
sh: bash: Permission denied

/data/data/berserker.android.apps.sshdroid/home $ ls -l /bin/bash
ls: /bin/bash: No such file or directory

/data/data/berserker.android.apps.sshdroid/home $ find / -name "bash"
find: /config: Permission denied
lots more.......
find: /proc/595/task/598/fd: Permission denied
......
find: /data: Permission denied
find: /root: Permission denied