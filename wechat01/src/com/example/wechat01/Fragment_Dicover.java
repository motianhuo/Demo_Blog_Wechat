package com.example.wechat01;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 发现界面
 * 
 * @author juns
 *
 */
public class Fragment_Dicover extends Fragment {
	private Activity ctx;
	private View layout;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (layout == null) {
			ctx = this.getActivity();
			layout = ctx.getLayoutInflater().inflate(R.layout.layout_fragment,
					null);
			initView();
		} else {
			ViewGroup parent = (ViewGroup) layout.getParent();
			if (parent != null) {
				parent.removeView(layout);
			}
		}
		return layout;
	}

	private void initView() {
		// TODO 实现本页面的布局
		TextView txt_msg = (TextView) layout.findViewById(R.id.txt_msg);
		txt_msg.setText("发现界面");
	}
}
