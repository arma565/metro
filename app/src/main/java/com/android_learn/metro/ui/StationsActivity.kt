package com.android_learn.metro.ui

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.android_learn.metro.R
import com.android_learn.metro.appconfig.AppConfig
import com.android_learn.metro.databinding.ActivityStationsBinding
import com.android_learn.metro.models.State
import com.android_learn.metro.models.Stations

class StationsActivity : AppCompatActivity() {
    lateinit var binding: ActivityStationsBinding
    lateinit var bundle: Bundle
    lateinit var stations: Stations
    lateinit var appConfig: AppConfig
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStationsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        appConfig = AppConfig(applicationContext)
        binding.imgBack.setOnClickListener {
            finish()
        }
        bundle = intent.extras!!
        stations = bundle.getParcelable<Stations>("stations")!!
        binding.txtStationTitle.text = stations.Title
        binding.txtStationEnglishTitle.text = stations.Title_English
        binding.txtAddress.text = stations.addr
        binding.txtLine.text = appConfig.getTitle()
        binding.txtEnglishLine.text = appConfig.getEnglishTitle()

        when (stations.LineId.toInt()) {
            0 -> {
                binding.linearLines.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.teal_200))
                binding.linearFeatures.setBackgroundColor(ContextCompat.getColor(applicationContext, R.color.teal_200))
            }
            1 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.purple_200
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.purple_200
                    )
                )
            }
            2 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.red
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.red
                    )
                )
            }
            3 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.green
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.green
                    )
                )

            }
            4 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.blue
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.blue
                    )
                )
            }
            5 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.teal1000
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.teal1000
                    )
                )
            }
            6 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.purple_500
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.purple_500
                    )
                )
            }
            7 -> {
                binding.linearLines.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.teal_700
                    )
                )
                binding.linearFeatures.setBackgroundColor(
                    ContextCompat.getColor(
                        applicationContext,
                        R.color.teal_700
                    )
                )
            }
        }
        if (stations.atm.toInt() == State.TRUE.state) {
            binding.imgAtm.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtAtmFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtAtmEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))

        } else {
            binding.imgAtm.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtAtmFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtAtmEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }

        if (stations.taxi.toInt() == State.TRUE.state) {
            binding.imgTaxiFacilities.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtTaxiFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtTaxiEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgTaxiFacilities.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtTaxiFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtTaxiEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }

        if (stations.parking.toInt() == State.TRUE.state) {
            binding.imgParking.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtParkingFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtParkingEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgParking.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtParkingFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtParkingEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.elevator.toInt() == State.TRUE.state) {
            binding.imgElevator.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtElevatorFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtElevatorEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgElevator.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtElevatorFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtElevatorEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.phone.toInt() == State.TRUE.state) {
            binding.imgPhone.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtPhoneFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtPhoneEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgPhone.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtPhoneFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtPhoneEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.ticket.toInt() == State.TRUE.state) {
            binding.imgTicket.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtTicketFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtTicketEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgTicket.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtTicketFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtTicketEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.escalator.toInt() == State.TRUE.state) {
            binding.imgEscalator.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtEscalatorFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtEscalatorEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgEscalator.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtEscalatorFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtEscalatorEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.water.toInt() == State.TRUE.state) {
            binding.imgWater.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtWaterFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtWaterEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgWater.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtWaterFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtWaterEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
        if (stations.bus.toInt() == State.TRUE.state) {
            binding.imgBusStation.setColorFilter(ContextCompat.getColor(applicationContext, R.color.white), PorterDuff.Mode.SRC_IN)
            binding.txtBusStationFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
            binding.txtImgBusStationEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.white))
        } else {
            binding.imgBusStation.setColorFilter(ContextCompat.getColor(applicationContext, R.color.liteWhite), PorterDuff.Mode.SRC_IN)
            binding.txtBusStationFa.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
            binding.txtImgBusStationEn.setTextColor(ContextCompat.getColor(applicationContext, R.color.liteWhite))
        }
    }
}