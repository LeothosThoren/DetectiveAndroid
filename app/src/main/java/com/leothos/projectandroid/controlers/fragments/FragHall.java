package com.leothos.projectandroid.controlers.fragments;


import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseFragment;
import com.leothos.projectandroid.business_logic.ItemAction;
import com.leothos.projectandroid.models.ItemObject;

import butterknife.BindView;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragHall extends BaseFragment implements ItemAction {

    // Widget
    @BindView(R.id.library_button)
    Button mLibraryButton;
    @BindView(R.id.kitchen_button)
    Button mKitchenButton;
    @BindView(R.id.item_pistol)
    ImageView mPistolItem;

    // Var
    private ItemObject item = new ItemObject(
            "Pistol",
            "A gun found in the hall",
            R.drawable.ic_pistol);

    @Override
    protected int getFragmentLayout() {
        return R.layout.fragment_mansion_hall;
    }

    @Override
    protected void configureFragment() {

    }

    @Override
    protected void updateFragment() {
        mKitchenButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragHall_to_fragKitchen));
        mLibraryButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragHall_to_fragLibrary));

        mPistolItem.setOnClickListener(v -> {
            takeItem(item);
            if (checkItem(item.getItemName())) {
                Toast.makeText(getContext(), "Test ramassage + " + item.getItemName(), Toast.LENGTH_SHORT).show();
            }
        });


    }

}
