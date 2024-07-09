package com.example.camera_ap2.domain.repository

import android.location.Location
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}
