package se.gritacademy.orientationjava23

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView.Orientation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            // In landscape
            findViewById<Button>(R.id.button).setOnClickListener({
                Toast.makeText(this, "BE MY SIGMA", Toast.LENGTH_SHORT).show()
            })
        } else {
            findViewById<Button>(R.id.button).setOnClickListener({
                Toast.makeText(this, "LET THEM COOK", Toast.LENGTH_SHORT).show()
            })
            // In portrait
        }

   /*     findViewById<Button>(R.id.button).setOnClickListener({
            Toast.makeText(this,
                if (resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE)
                     "be my sigma"
                else
                    "Skibidi bapp "
                , Toast.LENGTH_SHORT).show()
        })*/
    }
}