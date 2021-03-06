package com.qingmei2.rximagepicker_extension_wechat.ui.widget;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.widget.AdapterView;

import com.qingmei2.rximagepicker_extension.ui.widget.AlbumsSpinner;

public class WechatAlbumsSpinner extends AlbumsSpinner {

    public WechatAlbumsSpinner(@NonNull Context context) {
        mListPopupWindow = new ListPopupWindow(context);
        mListPopupWindow.setModal(true);

        mListPopupWindow.setContentWidth(context.getResources().getDisplayMetrics().widthPixels);
        mListPopupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                WechatAlbumsSpinner.this.onItemSelected(parent.getContext(), position);
                if (mOnItemSelectedListener != null) {
                    mOnItemSelectedListener.onItemSelected(parent, view, position, id);
                }
            }
        });
    }
}
