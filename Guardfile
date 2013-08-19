guard :shell do
  watch /(.*\.java|.*\.groovy)/ do |m|
    `gradle build integrationTest --info`
  end
end
