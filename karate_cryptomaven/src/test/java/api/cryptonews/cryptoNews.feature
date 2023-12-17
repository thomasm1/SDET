

Background: Web-Scraping Results for news

    * url 'http://localhost:3000/'

Feature: News API karate test script

Scenario: get all posts and then get the first post by id
    Given path 'api/cryptonews'
    When method get
    Then status 200




# * def id = response.id
# * print 'created id is: ', id

# Given path id
# When method get
# Then status 200
# And match response contains post



#     * request = """



#       """
#     WHEN POST

#     * response """
# // 20220321163104
# // http://localhost:3000/cryptonews

# [
# {
# "title": "Ethereum$2,921.31+1.01%",
# "url": "https://www.coindesk.comundefined",
# "source": "coindesk"
# },
# {
# "title": "Ethereum Classic$38.59-0.13%",
# "url": "https://www.coindesk.comundefined",
# "source": "coindesk"
# },
# {
# "title": " Ethereum ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# },
# {
# "title": " Ethereum101 ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# },
# {
# "title": " ETH derivatives show pro traders are worried about Ethereum’s $2.5K support ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# }
# ]
# "
# THEN



# // 20220321163104
# // http://localhost:3000/cryptonews

# [
# {
# "title": "Ethereum$2,921.31+1.01%",
# "url": "https://www.coindesk.comundefined",
# "source": "coindesk"
# },
# {
# "title": "Ethereum Classic$38.59-0.13%",
# "url": "https://www.coindesk.comundefined",
# "source": "coindesk"
# },
# {
# "title": " Ethereum ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# },
# {
# "title": " Ethereum101 ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# },
# {
# "title": " ETH derivatives show pro traders are worried about Ethereum’s $2.5K support ",
# "url": "https://cointelegraph.comundefined",
# "source": "cointelegraph"
# }
# ]