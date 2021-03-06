/**
 * MIT License
 * <p>
 * Copyright (C) 2020 by Qifan YANG (@underwindfall)
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.qifan.emojibattle.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import com.qifan.emojibattle.R
import com.qifan.emojibattle.databinding.ActivitySplashBinding
import com.qifan.emojibattle.ui.base.BaseActivity
import com.qifan.emojibattle.ui.view.TileDrawable

class SplashActivity : BaseActivity<ActivitySplashBinding>() {
  override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> ActivitySplashBinding =
    ActivitySplashBinding::inflate
  private val scrollBackground get() = binding.scrollingBackground
  private val play get() = binding.play

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    scrollBackground.setImageDrawable(
      AppCompatResources.getDrawable(this, R.drawable.pattern)?.let {
        TileDrawable(
          it
        )
      }
    )
    play.setOnClickListener {
      startActivity(Intent(this, GameActivity::class.java))
      finish()
    }
  }
}
