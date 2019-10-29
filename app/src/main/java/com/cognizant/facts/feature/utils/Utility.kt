package com.cognizant.facts.feature.utils


import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.showSnackBar(message: String) = Snackbar.make(this, message, Snackbar.LENGTH_LONG).show()

