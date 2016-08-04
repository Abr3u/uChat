package com.google.firebase.codelab.friendlychat.firebase;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.codelab.friendlychat.FriendlyMessage;
import com.google.firebase.codelab.friendlychat.MainActivity;
import com.google.firebase.database.DatabaseReference;

public class FirebaseManager {
    // Firebase instance variables
    //auth
    private FirebaseAuth mFirebaseAuth;
    private FirebaseUser mFirebaseUser;
    //db
    private DatabaseReference mFirebaseDatabaseReference;
    private FirebaseRecyclerAdapter<FriendlyMessage, MainActivity.MessageViewHolder>
            mFirebaseAdapter;

    public static void initializeAuth(){}

}
