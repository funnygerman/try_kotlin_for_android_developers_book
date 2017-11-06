package com.funnygerman.kotlinweather.domain.commands

import com.funnygerman.kotlinweather.data.ForecastRequest
import com.funnygerman.kotlinweather.domain.mappers.ForecastDataMapper
import com.funnygerman.kotlinweather.domain.model.ForecastList

/**
 * Created by timur on 06.11.17.
 */
class RequestForecastCommand(private val zipCode:String):Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}