#!/bin/bash
VPNLOG="/var/log/vpncon.log"
MONLOG="/var/log/monscrpt.log"
STATUSFILE=/var/log/VPNSTATUS

# email space seperated
EMAILTO="aarti_sankhe@cactus.com chakrapani@WHATEVER"

function laststatus {
if grep $1  $STATUSFILE
then
  exit 1
fi
  exit 0
}

nmap -P0 -p25 199.8.7.29 > $VPNLOG
cat $VPNLOG >> $MONLOG
if grep -qi "open" $VPNLOG;
then
   echo "Partner VPN OK " >> $MONLOG
  ( laststatus "DOWN" ) && mailx -s "Partner VPN UP again" $EMAILTO < $VPNLOG ||   echo "UP" > $STATUSFILE
else
   echo "Partner VPN Failed" >> $MONLOG
  ( laststatus "UP" ) && mailx -s "Partner VPN Failed" $EMAILTO < $VPNLOG || echo "DOWN" > $STATUSFILE
fi