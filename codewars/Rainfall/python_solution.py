def mean(town, strng):
    data = parseData(town, strng)
    if not data == []:
        return sum(data)/len(data)
    else:
        return -1

def variance(town, strng):
    avg = mean(town, strng)
    data = parseData(town, strng)
    if not data == []:
        var = 0
        for i in data:
            var += (i - avg) ** 2
        return var/len(data)
    else:
        return -1

def parseData(town, strng):
    temp_list = strng.split("\n")
    data_list = list(map(lambda x: x.split(":"), temp_list))
    for data in data_list:
        if data[0] == town:
            town_data = data[1]
            town_data = town_data.split(",")
            town_data = list(map(lambda x: float(x.split(" ")[1]), town_data))
            return town_data
    return []
