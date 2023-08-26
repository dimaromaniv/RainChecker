//
//
//
//
//
//
//entity WeatherObject{
//        clouds Clouds,
//        coordinate Coordinate,
//        city City,
//        main Main,
//        wind Wind,
//        weather Weather
//        }
//
//        entity WeatherResponse{
//        cod String ,
//        message String,
//        list List
//        }
//
//        entity WeatherData{
//        coord Coordinate,
//        weather Weather,
//        main Main,
//        wind Wind,
//        clouds Clouds,
//        sys Sys,
//        city City,
//        id Integer,
//        }
//        entity City {
//        country String,
//        population Integer,
//        timezone Integer
//        }
//
//        entity Clouds {
//
//        cloudsAll Integer,
//        }
//
//        entity Coordinate{
//        lan Double,
//        lat Double
//        }
//        entity Main{
//        temp Double,
//        feelsLike Double,
//        tempMin Double,
//        tempMax Double,
//        pressure Integer,
//        humidity Integer,
//        seaLevel Integer,
//        groundLevel Integer,
//        }
//        entity Sys{
//        type Integer,
//        id Integert ,
//        sunrise Long,
//        sunset Long
//        }
//        entity Weather{
//        id Integer,
//        main String,
//        description String
//        }
//        entity Wind{
//        speed Double,
//        deg Integer
//        }
//
//        entity APIConnector{}
//
//        entity Calculation {
//        weatherObject WeatherObject
//        }
//        relationship OneToOne {
//        WeatherResponse{list} to WeatherData
//        }
//        relationship OneToOne {
//        WeatherResponse{list} to Calculation
//        }
//
//        relationship OneToOne {
//        WeatherData{coord} to Coordinate,
//        WeatherData{weather} to Weather,
//        WeatherData{main} to Main,
//        WeatherData{wind} to Wind,
//        WeatherData{clouds} to Clouds,
//        WeatherData{sys} to Sys,
//        WeatherData{city} to City
//        }
//        relationship OneToOne {
//        WeatherObject{city} to WeatherData
//        }
//        relationship OneToOne {
//        WeatherResponse{list} to APIConnector
//        }
//
//
//
//
//
