if nmap -P0 -p25 199.8.7.29 | grep -qi open >/dev/null 2>&1;
echo "[ $(/bin/date) ]: Partner VPN Failed" >> /var/log/monscrpt.log
mailx -s "Partner VPN Failed" 'aarti_sankhe@cactus.com' < /dev/null
exit 1;
else
echo "[ $(/bin/date) ]: VPN status looks good " >> /var/log/monscrpt.log
fi
exit 0;