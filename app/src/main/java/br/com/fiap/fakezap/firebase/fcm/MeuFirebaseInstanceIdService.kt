package br.com.fiap.fakezap.firebase.fcm

import com.google.firebase.iid.FirebaseInstanceIdService
import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.orhanobut.hawk.Hawk


class MeuFirebaseInstanceIdService : FirebaseInstanceIdService() {

    override fun onTokenRefresh() {
        super.onTokenRefresh()
        Hawk.put("TOKENFIREBASE",FirebaseInstanceId.getInstance().token)
    }
}
