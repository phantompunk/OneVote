package edu.moranrvcu.onevote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.microblink.activity.ScanCard;
import com.microblink.recognizers.barcode.usdl.USDLRecognizerSettings;
import com.microblink.recognizers.settings.RecognizerSettings;

public class ScannerActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 0x101;

    private static final String LICENSE_KEY = "EMLJ6FVB-QL2W3F4B-FP3OJLKD-7Y6Y22JD-EI4JZVXB-EI4JZVXB-EI4JZVXB-FKI7HIQG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanner);

        // Intent for ScanCard Activity
        Intent intent = new Intent(this, ScanCard.class);

// set your licence key
// obtain your licence key at http://microblink.com/login or
// contact us at http://help.microblink.com
        intent.putExtra(ScanCard.EXTRAS_LICENSE_KEY, LICENSE_KEY);

// setup array of recognition settings (described in chapter "Recognition
// settings and results")
        RecognizerSettings[] settArray = setupSettingsArray();
        intent.putExtra(ScanCard.EXTRAS_RECOGNIZER_SETTINGS_ARRAY, settArray);

// Starting Activity
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scanner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private RecognizerSettings[] setupSettingsArray() {
        USDLRecognizerSettings sett = new USDLRecognizerSettings();
        // disallow scanning of barcodes that have invalid checksum
        sett.setUncertainScanning(false);
        // disable scanning of barcodes that do not have quiet zone
        // as defined by the standard
        sett.setNullQuietZoneAllowed(false);

        // now add sett to recognizer settings array that is used to configure
        // recognition
        return new RecognizerSettings[] { sett };
    }
}
