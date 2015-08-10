package com.blakebarrett.drkmsg;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;

public class WiFiDirectBroadcastReceiver extends BroadcastReceiver {

    private WifiP2pManager mManager;
    private WifiP2pManager.Channel mChannel;
    private Activity mActivity;

    public WiFiDirectBroadcastReceiver(final WifiP2pManager manager, final WifiP2pManager.Channel channel,
                                       final Activity activity) {
        super();
        this.mManager = manager;
        this.mChannel = channel;
        this.mActivity = activity;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        final String action = intent.getAction();

        switch (action) {
            case WifiP2pManager.WIFI_P2P_STATE_CHANGED_ACTION: break;
            case WifiP2pManager.WIFI_P2P_PEERS_CHANGED_ACTION: break;
            case WifiP2pManager.WIFI_P2P_CONNECTION_CHANGED_ACTION: break;
            case WifiP2pManager.WIFI_P2P_THIS_DEVICE_CHANGED_ACTION: break;
            default: break;
        }
    }
}
