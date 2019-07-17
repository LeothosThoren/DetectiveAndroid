package com.leothos.projectandroid.controlers.fragments;


import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.leothos.projectandroid.R;
import com.leothos.projectandroid.base.BaseFragment;
import com.leothos.projectandroid.business_logic.ItemAction;
import com.leothos.projectandroid.models.ItemList;

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
            //TODO : Ajouter un menu au click pour afficher  si on veut prendre l'item ou pas
            // si oui alors ajouter au sac et effacer l'objet de la vue sinon laisser la vue et ne rien faire dans le sac

            takeItem(ItemList.PISTOL);

        });


    }

}
