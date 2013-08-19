guard :shell do
  watch /(.*\.java|.*\.properties)/ do |m|
    `gradle build integrationTest --info`
  end
end
