$ phonedash=256-751-022040

$ phonenodash="${phonedash//-}"

$ phone=$phonenodash

$ echo $phone
1231231234

$ echo "(${phone:0:3}) ${phone:3:3}-${phone:6:4}"
(256) 751-022040
(256) 756-667706
(256) 797-328899

$ new_phone=$(echo "(${phone:0:3}) ${phone:3:3}-${phone:6:4}")

$ echo $new_phone 
(256) 751-022040

$ phone="123-456-7890"
$ plainPhone=$(echo $phone | sed "s/-//g")
$ formatedPhone1=$(echo $phone | sed "s/\(.*\)-\(.*\)-\(.*\)/(\1) \2 - \3/")
$ formatedPhone2=$(echo $plainPhone | sed "s/\([0-9]\{3\}\)\([0-9]\{3\}\)\([0-9]*\)/(\1) \2 - \3/")
$
$ echo $plainPhone 
1234567890
$ echo $formatedPhone1 
(123) 456 - 7890
$ echo $formatedPhone2 
(123) 456 - 7890
