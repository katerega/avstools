stop() {
    echo  "Stopping VPN connection:"
    sudo ps -aef | grep openconnect
    sudo kill -9 $(pidof openconnect)
}