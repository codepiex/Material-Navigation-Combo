/*
 * Copyright (C) 2015 Eeshan Jamal
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.techie.navigation.common;

import com.techie.navigation.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PlaceHolderFragment extends Fragment {

	
	
	public PlaceHolderFragment() {
		
	}
	
	public static final PlaceHolderFragment newInstance(String title)
	{
	    PlaceHolderFragment f = new PlaceHolderFragment();
	    
	    f.setArguments(getBundle(title));
	    return f;
	}
	
	public static Bundle getBundle(String title){
		Bundle bdl = new Bundle(1);
	    bdl.putString("title", title);
	    return bdl;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.placeholder_fragment, container,false);
		
		String title = null;
		
		if(getArguments()!=null){
			title = getArguments().getString("title");
		}
		
		if(title == null){
			title = "No Title Found!!";
		}
		
		TextView tv = (TextView)rootView.findViewById(R.id.title);
		tv.setText(title);
		
		return rootView;
	}

}
