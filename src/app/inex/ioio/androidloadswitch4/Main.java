package app.inex.ioio.androidloadswitch4;

import ioio.lib.api.DigitalInput;
import ioio.lib.api.DigitalOutput;
import ioio.lib.api.exception.ConnectionLostException;
import ioio.lib.util.BaseIOIOLooper;
import ioio.lib.util.IOIOLooper;
import ioio.lib.util.android.IOIOActivity;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;
import android.widget.ToggleButton;


public class Main extends IOIOActivity {
	int sw1_resId, sw2_resId, sw3_resId, sw4_resId;
	ToggleButton toggleButton1, toggleButton2, toggleButton3, toggleButton4;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.RGBA_8888);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);

		// Call value from storage in last time used
		SharedPreferences sp = getPreferences(MODE_PRIVATE);
		sw1_resId = sp.getInt("sw1_resId", R.drawable.selector_plug);
		sw2_resId = sp.getInt("sw2_resId", R.drawable.selector_plug);
		sw3_resId = sp.getInt("sw3_resId", R.drawable.selector_plug);
		sw4_resId = sp.getInt("sw4_resId", R.drawable.selector_plug);
		
		toggleButton1 = (ToggleButton)findViewById(R.id.toggleButton1);
		toggleButton1.setBackgroundResource(sw1_resId);
		toggleButton1.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View arg0) {
				final Dialog dialog = new Dialog(Main.this);
				dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.dialog_button);
				dialog.setCancelable(true);
				
				Button button1 = (Button) dialog.findViewById(R.id.button1);
				button1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_battery);
						sw1_resId = R.drawable.selector_battery;
						dialog.cancel();
					}
				});
				
				Button button2 = (Button) dialog.findViewById(R.id.button2);
				button2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_bulb);
						sw1_resId = R.drawable.selector_bulb;
						dialog.cancel();
					}
				});
				
				Button button3 = (Button) dialog.findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_computer);
						sw1_resId = R.drawable.selector_computer;
						dialog.cancel();
					}
				});
				
				Button button4 = (Button) dialog.findViewById(R.id.button4);
				button4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_fan);
						sw1_resId = R.drawable.selector_fan;
						dialog.cancel();
					}
				});
				
				Button button5 = (Button) dialog.findViewById(R.id.button5);
				button5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_plug);
						sw1_resId = R.drawable.selector_plug;
						dialog.cancel();
					}
				});
				
				Button button6 = (Button) dialog.findViewById(R.id.button6);
				button6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton1.setBackgroundResource(R.drawable.selector_tv);
						sw1_resId = R.drawable.selector_tv;
						dialog.cancel();
					}
				});

		        dialog.show();
				return true;
			}
		});
    	
		
		toggleButton2 = (ToggleButton)findViewById(R.id.toggleButton2);
		toggleButton2.setBackgroundResource(sw2_resId);
    	toggleButton2.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View arg0) {
				final Dialog dialog = new Dialog(Main.this);
				dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.dialog_button);
				dialog.setCancelable(true);
				
				Button button1 = (Button) dialog.findViewById(R.id.button1);
				button1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_battery);
						sw2_resId = R.drawable.selector_battery;
						dialog.cancel();
					}
				});
				
				Button button2 = (Button) dialog.findViewById(R.id.button2);
				button2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_bulb);
						sw2_resId = R.drawable.selector_bulb;
						dialog.cancel();
					}
				});
				
				Button button3 = (Button) dialog.findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_computer);
						sw2_resId = R.drawable.selector_computer;
						dialog.cancel();
					}
				});
				
				Button button4 = (Button) dialog.findViewById(R.id.button4);
				button4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_fan);
						sw2_resId = R.drawable.selector_fan;
						dialog.cancel();
					}
				});
				
				Button button5 = (Button) dialog.findViewById(R.id.button5);
				button5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_plug);
						sw2_resId = R.drawable.selector_plug;
						dialog.cancel();
					}
				});
				
				Button button6 = (Button) dialog.findViewById(R.id.button6);
				button6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton2.setBackgroundResource(R.drawable.selector_tv);
						sw2_resId = R.drawable.selector_tv;
						dialog.cancel();
					}
				});

		        dialog.show();
				return true;
			}
		});
		
		toggleButton3 = (ToggleButton)findViewById(R.id.toggleButton3);
		toggleButton3.setBackgroundResource(sw3_resId);
    	toggleButton3.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View arg0) {
				final Dialog dialog = new Dialog(Main.this);
				dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.dialog_button);
				dialog.setCancelable(true);
				
				Button button1 = (Button) dialog.findViewById(R.id.button1);
				button1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_battery);
						sw3_resId = R.drawable.selector_battery;
						dialog.cancel();
					}
				});
				
				Button button2 = (Button) dialog.findViewById(R.id.button2);
				button2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_bulb);
						sw3_resId = R.drawable.selector_bulb;
						dialog.cancel();
					}
				});
				
				Button button3 = (Button) dialog.findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_computer);
						sw3_resId = R.drawable.selector_computer;
						dialog.cancel();
					}
				});
				
				Button button4 = (Button) dialog.findViewById(R.id.button4);
				button4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_fan);
						sw3_resId = R.drawable.selector_fan;
						dialog.cancel();
					}
				});
				
				Button button5 = (Button) dialog.findViewById(R.id.button5);
				button5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_plug);
						sw3_resId = R.drawable.selector_plug;
						dialog.cancel();
					}
				});
				
				Button button6 = (Button) dialog.findViewById(R.id.button6);
				button6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton3.setBackgroundResource(R.drawable.selector_tv);
						sw3_resId = R.drawable.selector_tv;
						dialog.cancel();
					}
				});

		        dialog.show();
				return true;
			}
		});
		
		toggleButton4 = (ToggleButton)findViewById(R.id.toggleButton4);
		toggleButton4.setBackgroundResource(sw4_resId);
    	toggleButton4.setOnLongClickListener(new OnLongClickListener() {
			@Override
			public boolean onLongClick(View arg0) {
				final Dialog dialog = new Dialog(Main.this);
				dialog.requestWindowFeature(dialog.getWindow().FEATURE_NO_TITLE);
				dialog.setContentView(R.layout.dialog_button);
				dialog.setCancelable(true);
				
				Button button1 = (Button) dialog.findViewById(R.id.button1);
				button1.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_battery);
						sw4_resId = R.drawable.selector_battery;
						dialog.cancel();
					}
				});
				
				Button button2 = (Button) dialog.findViewById(R.id.button2);
				button2.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_bulb);
						sw4_resId = R.drawable.selector_bulb;
						dialog.cancel();
					}
				});
				
				Button button3 = (Button) dialog.findViewById(R.id.button3);
				button3.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_computer);
						sw4_resId = R.drawable.selector_computer;
						dialog.cancel();
					}
				});
				
				Button button4 = (Button) dialog.findViewById(R.id.button4);
				button4.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_fan);
						sw4_resId = R.drawable.selector_fan;
						dialog.cancel();
					}
				});
				
				Button button5 = (Button) dialog.findViewById(R.id.button5);
				button5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_plug);
						sw4_resId = R.drawable.selector_plug;
						dialog.cancel();
					}
				});
				
				Button button6 = (Button) dialog.findViewById(R.id.button6);
				button6.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						toggleButton4.setBackgroundResource(R.drawable.selector_tv);
						sw4_resId = R.drawable.selector_tv;
						dialog.cancel();
					}
				});

		        dialog.show();
				return true;
			}
		});
	}
	
	// On stop function
	@Override
    public void onStop() {
        super.onStop();
        // Temporary lvWarn value to storage for use in next time
        SharedPreferences sp = getPreferences(MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.putInt("sw1_resId", sw1_resId);
        editor.putInt("sw2_resId", sw2_resId);
        editor.putInt("sw3_resId", sw3_resId);
        editor.putInt("sw4_resId", sw4_resId);
        editor.commit();
    }

	class Looper extends BaseIOIOLooper {
		DigitalOutput P1, P2, P3, P4, LE;
		DigitalInput Di1, Di2, Di3, Di4;
        @Override
        protected void setup() throws ConnectionLostException {
        	final Boolean[] state = new Boolean[4];
        	
        	Di1 = ioio_.openDigitalInput(48);
        	Di2 = ioio_.openDigitalInput(47);
        	Di3 = ioio_.openDigitalInput(46);
        	Di4 = ioio_.openDigitalInput(45);
        	
        	try {
				Thread.sleep(100);
	        	state[0] = Di1.read();
	        	state[1] = Di2.read();
	        	state[2] = Di3.read();
	        	state[3] = Di4.read();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
        	
        	for(int i = 0 ; i < state.length ; i++) {
        		Log.i("Check State" + String.valueOf(i), String.valueOf(state[i]));
        	}

        	LE = ioio_.openDigitalOutput(31, true);
			P1 = ioio_.openDigitalOutput(35, state[0]);
        	P2 = ioio_.openDigitalOutput(34, state[1]);
        	P3 = ioio_.openDigitalOutput(33, state[2]);
        	P4 = ioio_.openDigitalOutput(32, state[3]);
        	LE.write(false);
        	
            runOnUiThread(new Runnable() {
				public void run() {
						toggleButton1.setChecked(state[0]);
						toggleButton2.setChecked(state[1]);
						toggleButton3.setChecked(state[2]);
						toggleButton4.setChecked(state[3]);
				}		
			});
        	
        	toggleButton1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
    			public void onCheckedChanged(CompoundButton buttonView,
    					boolean isChecked) {
    				try {
    					LE.write(true);
    					P1.write(isChecked);
    					LE.write(false);
					} catch (ConnectionLostException e) { }
    			}
    		});
        	
        	toggleButton2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
    			public void onCheckedChanged(CompoundButton buttonView,
    					boolean isChecked) {
    				try {
    					LE.write(true);
    					P2.write(isChecked);
    					LE.write(false);
					} catch (ConnectionLostException e) { }
    			}
    		});
        	
        	toggleButton3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
    			public void onCheckedChanged(CompoundButton buttonView,
    					boolean isChecked) {
    				try {
    					LE.write(true);
    					P3.write(isChecked);
    					LE.write(false);
					} catch (ConnectionLostException e) { }
    			}
    		});
        	
        	toggleButton4.setOnCheckedChangeListener(new OnCheckedChangeListener() {
    			public void onCheckedChanged(CompoundButton buttonView,
    					boolean isChecked) {
    				try {
    					LE.write(true);
    					P4.write(isChecked);
    					LE.write(false);
					} catch (ConnectionLostException e) { }
    			}
    		});
        	
            runOnUiThread(new Runnable() {
				public void run() {
					Toast.makeText(getApplicationContext(), 
							"Connected!", Toast.LENGTH_SHORT).show();
				}		
			});
        }

        public void loop() throws ConnectionLostException { }
    }

	@Override
    protected IOIOLooper createIOIOLooper() {
        return new Looper();
    }
}
