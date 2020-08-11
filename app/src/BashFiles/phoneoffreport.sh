l=`nmap -P0 -p25 199.8.7.29`
echo $l > /var/log/vpncon.log && echo $l >> /var/log/monscrpt.log
grep -qi "open" /var/log/vpncon.log
j=`echo $?`
if [ $j -ne 0 ]; then
echo Partner VPN Failed >> /var/log/monscrpt.log && echo $l | mailx -s "Partner VPN Failed" 'aarti_sankhe@cactus.com'
fi