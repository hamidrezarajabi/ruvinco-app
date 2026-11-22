package com.ruvinco.app
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
  private lateinit var w: WebView
  override fun onCreate(b: Bundle?) {
    super.onCreate(b)
    w = WebView(this); setContentView(w)
    w.settings.javaScriptEnabled = true
    w.settings.domStorageEnabled = true   // stores site address and key on the phone
    w.loadUrl("file:///android_asset/app.html")
  }
  @Deprecated("back goes to previous page")
  override fun onBackPressed() { if (w.canGoBack()) w.goBack() else super.onBackPressed() }
}
