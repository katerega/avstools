#!/system/bin/sh
docker run -it -p 127.0.0.1:8080:8080 -v "$PWD:/home/coder/project" codercom/code-server
am broadcast android.intent.action.ACTION_SHUTDOWN
# Intent intent = VpnService.prepare(getApplicationContext());if (intent != null) {startActivityForResult(intent, 0);} else {onActivityResult(0, RESULT_OK, null);}
su -c 'am start -a android.intent.action.REBOOT'
su -c 'svc power reboot'
killall zygote

sleep 5
reboot
  